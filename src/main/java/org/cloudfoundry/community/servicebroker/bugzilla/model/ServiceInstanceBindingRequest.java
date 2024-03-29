package org.cloudfoundry.community.servicebroker.bugzilla.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
//import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Request sent from the cloud controller to bind to a service 
 * instance.
 * 
 * @author sgreenberg@gopivotal.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ServiceInstanceBindingRequest {

	//@NotEmpty
	@JsonSerialize
	@JsonProperty("service_id")//service_id
	private String serviceDefinitionId;
	
	//@NotEmpty
	@JsonSerialize
	@JsonProperty("plan_id")
	private String planId;

	//@NotEmpty
	@JsonSerialize
	@JsonProperty("app_guid")
	private String appGuid;
	
	//@NotEmpty
	@JsonSerialize
	@JsonProperty("service_instance_guid")
	private String serviceInstanceGuId;
	
	public String getServiceInstanceGuId() {
		return serviceInstanceGuId;
	}

	public void setServiceInstanceGuId(String serviceInstanceGuId) {
		this.serviceInstanceGuId = serviceInstanceGuId;
	}

	public ServiceInstanceBindingRequest() {}
	
	public ServiceInstanceBindingRequest(String serviceDefinitionId, String planId, String appGuid) {
		this.serviceDefinitionId = serviceDefinitionId;
		this.planId = planId;
		this.appGuid = appGuid;
	}

	public String getServiceDefinitionId() {
		return serviceDefinitionId;
	}
	
	public void setServiceDefinitionId(String serviceDefinitionId) {
		this.serviceDefinitionId = serviceDefinitionId;
	}

	public String getPlanId() {
		return planId;
	}
	
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getAppGuid() {
		return appGuid;
	}

	public void setAppGuid(String appGuid) {
		this.appGuid = appGuid;
	}
	
}
