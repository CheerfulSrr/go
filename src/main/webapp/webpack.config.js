const path = require('path')
const {CleanWebpackPlugin} = require('clean-webpack-plugin')
const {argv} = require('yargs')

const {
  mode = 'development',
} = argv

module.exports = {
  mode: mode === 'development' ? mode : 'production',
  entry: './app/index.jsx',
  output: {
    filename: 'bundle.js',
    path: path.resolve(__dirname, './static/js')
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
    new CleanWebpackPlugin({ cleanStaleWebpackAssets: false })
  ]
};