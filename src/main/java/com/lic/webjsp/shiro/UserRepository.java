package com.lic.webjsp.shiro;

/**
 * @Author relic
 * @Date 2019/4/29
 * @描述:
 */
public interface UserRepository extends BaseRepository<User,Long>{
    User findByName(String name);

}
