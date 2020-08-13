package greekn.io.system.user;

import greekn.io.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Date;

/**
 * <p>
 *
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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
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
        return true;
    }
}
