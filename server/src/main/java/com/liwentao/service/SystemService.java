package com.liwentao.service;

import com.liwentao.entity.XgMenu;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liwentao
 */
@Component
public interface SystemService {
    List<XgMenu> getMenus(Integer roleId);
}
