Feature: calling sample rest api

Background:
    * url demoBaseUrl

Scenario: get id = 2

Given path 'posts/2'
When method get
Then status 200
And assert response.userId == 1
And assert response.id == 2
And assert response.title == "qui est esse"
And print response

