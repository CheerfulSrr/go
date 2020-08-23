package greekn.io.system.user;

import greekn.io.common.BaseEntity;
import greekn.io.common.constant.SysConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

/**
 * <p>
 * user
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-13 16:47
 * @package: greekn.io.system.user
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "sys_user")
@Entity
public class UserEntity extends BaseEntity implements UserDetails {

    private String name;

    private String password;

    private String iconUrl;

    private String phone;

    private String email;

    private Date birthday;

    private String address;

    private Boolean gender;

    private Boolean status;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.commaSeparatedStringToAuthorityList("MEMBER");
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return Objects.equals(this.status ? 1 : 0, SysConstant.ENABLE);
    }

}
