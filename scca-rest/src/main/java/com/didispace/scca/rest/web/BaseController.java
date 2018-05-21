package com.didispace.scca.rest.web;

import com.didispace.scca.core.domain.EncryptKeyRepo;
import com.didispace.scca.core.domain.EnvParamRepo;
import com.didispace.scca.core.domain.EnvRepo;
import com.didispace.scca.core.service.BaseOptService;
import com.didispace.scca.core.service.PersistenceService;
import com.didispace.scca.core.service.PropertiesService;
import com.didispace.scca.core.service.UrlMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 程序猿DD/翟永超 on 2018/4/27.
 * <p>
 * Blog: http://blog.didispace.com/
 * Github: https://github.com/dyc87112/
 */
@RequestMapping("/scca")
public class BaseController {

    @Autowired
    protected EnvRepo envRepo;
    @Autowired
    protected EnvParamRepo envParamRepo;
    @Autowired
    protected EncryptKeyRepo encryptKeyRepo;

    @Autowired
    protected BaseOptService baseOptService;
    @Autowired
    protected PersistenceService persistenceService;
    @Autowired
    protected PropertiesService propertiesService;
    @Autowired
    protected UrlMakerService urlMakerService;

}
