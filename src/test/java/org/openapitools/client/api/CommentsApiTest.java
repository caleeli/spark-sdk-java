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
import org.openapitools.client.model.Comments;
import org.openapitools.client.model.CommentsEditable;
import org.openapitools.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommentsApi
 */
@Ignore
public class CommentsApiTest {

    private final CommentsApi api = new CommentsApi();

    
    /**
     * Save a new comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCommentsTest() throws ApiException {
        CommentsEditable commentsEditable = null;
        Comments response = api.createComments(commentsEditable);

        // TODO: test validations
    }
    
    /**
     * Delete a comments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCommentsTest() throws ApiException {
        String commentId = null;
        Comments response = api.deleteComments(commentId);

        // TODO: test validations
    }
    
    /**
     * Get single comment by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentByIdTest() throws ApiException {
        String commentId = null;
        Comments response = api.getCommentById(commentId);

        // TODO: test validations
    }
    
    /**
     * Returns all comments for a given type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentsTest() throws ApiException {
        Integer commentableId = null;
        String commentableType = null;
        String filter = null;
        String orderBy = null;
        String orderDirection = null;
        Integer perPage = null;
        InlineResponse200 response = api.getComments(commentableId, commentableType, filter, orderBy, orderDirection, perPage);

        // TODO: test validations
    }
    
    /**
     * Update a comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCommentTest() throws ApiException {
        String commentId = null;
        CommentsEditable commentsEditable = null;
        Comments response = api.updateComment(commentId, commentsEditable);

        // TODO: test validations
    }
    
}
