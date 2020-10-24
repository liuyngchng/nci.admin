/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LX on 1/4/17.
 */
public interface IndexService {

    String showIndexPage(HttpServletRequest request, String indexUrl, String permission);

}
