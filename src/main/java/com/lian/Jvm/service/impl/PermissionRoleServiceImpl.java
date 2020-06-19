package com.lian.Jvm.service.impl;

import com.lian.Jvm.mapper.PermissionRoleMapper;
import com.lian.Jvm.model.PermissionRole;
import com.lian.Jvm.service.PermissionRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:23
 */
@Service
public class PermissionRoleServiceImpl implements PermissionRoleService {

    @Autowired
    PermissionRoleMapper permissionRoleMapper;

    @Override
    public PermissionRole add(PermissionRole permissionRole) {
        permissionRoleMapper.add(permissionRole);
        PermissionRole byId = permissionRoleMapper.findById(permissionRole.getId());
        return byId;
    }

    @Override
    public PermissionRole update(PermissionRole permissionRole) {
        PermissionRole update = permissionRoleMapper.update(permissionRole);
        PermissionRole byId = permissionRoleMapper.findById(permissionRole.getId());
        return byId;
    }

    @Override
    public List<PermissionRole> list() {
        List<PermissionRole> list = permissionRoleMapper.list();
        return list;
    }

    @Override
    public PermissionRole delete(Long id) {
        PermissionRole delete = permissionRoleMapper.delete(id);
        return delete;
    }

    @Override
    public List<PermissionRole> findListByRoleId(Long roleId) {
        List<PermissionRole> listByRoleId = permissionRoleMapper.findListByRoleId(roleId);
        return listByRoleId;
    }

    @Override
    public Map<Long, List<PermissionRole>> findMapGroupByRoleId() {
        Map<Long, List<PermissionRole>> mapGroupByRoleId = permissionRoleMapper.findMapGroupByRoleId();
        return mapGroupByRoleId;
    }
}
