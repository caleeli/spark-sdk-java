/*
 * ProcessMaker API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@processmaker.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import ProcessMaker_Client.ApiException;
import org.openapitools.client.model.InlineResponse20014;
import org.openapitools.client.model.ProcessRequest;
import org.openapitools.client.model.ProcessRequestEditable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProcessRequestsApi
 */
@Ignore
public class ProcessRequestsApiTest {

    private final ProcessRequestsApi api = new ProcessRequestsApi();

    
    /**
     * Delete a process request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProcessRequestTest() throws ApiException {
        String processRequestId = null;
        ProcessRequest response = api.deleteProcessRequest(processRequestId);

        // TODO: test validations
    }
    
    /**
     * Get single process request by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessRequestByIdTest() throws ApiException {
        String processRequestId = null;
        ProcessRequest response = api.getProcessRequestById(processRequestId);

        // TODO: test validations
    }
    
    /**
     * Returns all process Requests that the user has access to
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessesRequestsTest() throws ApiException {
        String type = null;
        String filter = null;
        String orderBy = null;
        String orderDirection = null;
        Integer perPage = null;
        String include = null;
        InlineResponse20014 response = api.getProcessesRequests(type, filter, orderBy, orderDirection, perPage, include);

        // TODO: test validations
    }
    
    /**
     * Update a process request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProcessRequestTest() throws ApiException {
        String processRequestId = null;
        ProcessRequestEditable processRequestEditable = null;
        ProcessRequest response = api.updateProcessRequest(processRequestId, processRequestEditable);

        // TODO: test validations
    }
    
}