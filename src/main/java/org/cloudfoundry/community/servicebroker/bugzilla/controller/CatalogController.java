package org.cloudfoundry.community.servicebroker.bugzilla.controller;

import org.cloudfoundry.community.servicebroker.bugzilla.model.Catalog;
import org.cloudfoundry.community.servicebroker.bugzilla.service.BugzillaCatalogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * See: Source: http://docs.cloudfoundry.com/docs/running/architecture/services/writing-service.html
 * 
 * @author sgreenberg@gopivotal.com
 */
@Controller
public class CatalogController extends BaseController {
	
	public static final String BASE_PATH = "/v2/catalog";
	
	private static final Logger logger = LoggerFactory.getLogger(CatalogController.class);
	
	private BugzillaCatalogService service;
	
	@Autowired 
	public CatalogController(BugzillaCatalogService service) {
		this.service = service;
	}
	
	@RequestMapping(value = BASE_PATH, method = RequestMethod.GET)
	public @ResponseBody Catalog getCatalog() {
		logger.debug("GET: " + BASE_PATH + ", getCatalog()");
		return service.getCatalog();
	}
	
}
