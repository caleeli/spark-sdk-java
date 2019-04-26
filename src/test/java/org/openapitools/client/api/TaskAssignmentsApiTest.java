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
import org.openapitools.client.model.TaskAssignments;
import org.openapitools.client.model.TaskAssignmentsEditable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskAssignmentsApi
 */
@Ignore
public class TaskAssignmentsApiTest {

    private final TaskAssignmentsApi api = new TaskAssignmentsApi();

    
    /**
     * Save a new task assignments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTaskAssignmentsTest() throws ApiException {
        TaskAssignmentsEditable taskAssignmentsEditable = null;
        TaskAssignments response = api.createTaskAssignments(taskAssignmentsEditable);

        // TODO: test validations
    }
    
    /**
     * Update a task assignments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskAssignmentsTest() throws ApiException {
        String taskAssignmentsId = null;
        TaskAssignmentsEditable taskAssignmentsEditable = null;
        TaskAssignments response = api.updateTaskAssignments(taskAssignmentsId, taskAssignmentsEditable);

        // TODO: test validations
    }
    
}
