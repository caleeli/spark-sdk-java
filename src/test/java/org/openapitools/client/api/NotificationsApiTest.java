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
import org.openapitools.client.model.InlineObject2;
import org.openapitools.client.model.InlineObject3;
import org.openapitools.client.model.InlineResponse20010;
import org.openapitools.client.model.Notifications;
import org.openapitools.client.model.NotificationsEditable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationsApi
 */
@Ignore
public class NotificationsApiTest {

    private final NotificationsApi api = new NotificationsApi();

    
    /**
     * Save a new notifications
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNotificationTest() throws ApiException {
        NotificationsEditable notificationsEditable = null;
        Notifications response = api.createNotification(notificationsEditable);

        // TODO: test validations
    }
    
    /**
     * Delete a notification
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotificationTest() throws ApiException {
        String notificationId = null;
        Notifications response = api.deleteNotification(notificationId);

        // TODO: test validations
    }
    
    /**
     * Get single notification by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationByIdTest() throws ApiException {
        String notificationId = null;
        Notifications response = api.getNotificationById(notificationId);

        // TODO: test validations
    }
    
    /**
     * Returns all notifications that the user has access to
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationsTest() throws ApiException {
        String status = null;
        String filter = null;
        String orderBy = null;
        String orderDirection = null;
        Integer perPage = null;
        String include = null;
        InlineResponse20010 response = api.getNotifications(status, filter, orderBy, orderDirection, perPage, include);

        // TODO: test validations
    }
    
    /**
     * Mark notifications as read by the user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processMakerHttpControllersApiNotificationControllerUpdateAsReadTest() throws ApiException {
        InlineObject2 inlineObject2 = null;
        api.processMakerHttpControllersApiNotificationControllerUpdateAsRead(inlineObject2);

        // TODO: test validations
    }
    
    /**
     * Mark notifications as read by id and type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processMakerHttpControllersApiNotificationControllerUpdateAsReadAllTest() throws ApiException {
        InlineObject3 inlineObject3 = null;
        api.processMakerHttpControllersApiNotificationControllerUpdateAsReadAll(inlineObject3);

        // TODO: test validations
    }
    
    /**
     * Update a notification
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNotificationTest() throws ApiException {
        String notificationId = null;
        NotificationsEditable notificationsEditable = null;
        Notifications response = api.updateNotification(notificationId, notificationsEditable);

        // TODO: test validations
    }
    
}
