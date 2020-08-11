const path = require('path')
const {CleanWebpackPlugin} = require('clean-webpack-plugin')
const {argv} = require('yargs')
const fs = require('fs')

// path
const appDirectory = fs.realpathSync(process.cwd());
const APP_PATH = path.resolve(appDirectory, 'app')
const PUBLIC_PATH = '/resources/js/'
const BUILD_PATH = path.join(__dirname, PUBLIC_PATH)
const BACKEND_PATH = 'http://localhost:8080'

const {
  mode = 'development',
} = argv

module.exports = {
  mode: mode === 'development' ? mode : 'production',
  entry: './app/index.jsx',
  output: {
    filename: 'bundle.js',
    path: BUILD_PATH,
    publicPath: PUBLIC_PATH
  },
  resolve: {
    alias: {
      '@': APP_PATH
    },
    extensions: ['.ts', '.tsx', '.js', '.jsx']
  },
  module: {
    rules: [
      {
        test: /\.jsx?$/,
        exclude: /node_modules/,
        use: ["babel-loader"]
      },
      {
        test: /\.css$/,
        use: ['style-loader', 'css-loader']
      },
      {
        test: /\.(png|svg|jpg|gif)$/,
        use: ['file-loader']
      },
      {
        test: /\.(woff|woff2|eot|ttf|otf)$/,
        use: ['file-loader']
      }
    ]
  },
  plugins: [
    new CleanWebpackPlugin({cleanStaleWebpackAssets: false})
  ],
  devServer: {
    inline: true,
    hot: true,
    port: 5000,
    publicPath: PUBLIC_PATH,
    contentBase: false,
    proxy: [
      {
        context: [
          "/"
        ],
        target: BACKEND_PATH + '/'
      },
      {
        context: path => {
          return /^\/resources\/js\/bundle\.(css|js)$/.test(path);
        },
        target: BACKEND_PATH + '/',
        changeOrigin: true,
      }
    ]
  }

};