# slack-app-clone-api
Slack App Clone API

## Following are the APIs provided
- GET /organization/1ae5241e-a51b-11ec-b909-0242ac120002
   ```js
    {
      "organization_name": "Full Stack",
      "organization_id": "1ae5241e-a51b-11ec-b909-0242ac120002"
    }
   ```
 - GET /users
   ```js
    [{
      "username": "shankar",
      "email": "shangan.23@gmail.com",
      "user_id": "1e780ade-a524-11ec-b909-0242ac120002"
    },{
      "username": "karthick",
      "email": "karthikeyan.pa@gmail.com",
      "user_id": "6ef005fc-a524-11ec-b909-0242ac120002"
    },{
      "username": "venkat",
      "email": "ramsunvtech@gmail.com",
      "user_id": "7f093ecc-a524-11ec-b909-0242ac120002"
    }]
   ```
- POST /channel
  ```js
    {
      "channel_name": "#slack",
      "organization_id": "1ae5241e-a51b-11ec-b909-0242ac120002",
      "description": "Slack channels",
      "is_private": true/false,
      "members":["1e780ade-a524-11ec-b909-0242ac120002","6ef005fc-a524-11ec-b909-0242ac120002","7f093ecc-a524-11ec-b909-0242ac120002"]
    }
   ```
- GET /channel
 ```js
    [{
      "channel_name": "#slack",
      "channel_id": "4f0300c2-a51b-11ec-b909-0242ac120002",
      "organization_id": "1ae5241e-a51b-11ec-b909-0242ac120002",
       "description": "Slack channels",
      "is_private": true,
       "members":["1e780ade-a524-11ec-b909-0242ac120002","6ef005fc-a524-11ec-b909-0242ac120002","7f093ecc-a524-11ec-b909-0242ac120002"]
    }]
   ```
   
- GET /messages/4f0300c2-a51b-11ec-b909-0242ac120002/1ae5241e-a51b-11ec-b909-0242ac120002 
/messages/<channel_id>/<organization_id>
 ```js
    [{
      messages:[{
           "from": "1e780ade-a524-11ec-b909-0242ac120002",
           "to": "7f093ecc-a524-11ec-b909-0242ac120002",
           "message":"This is test message",
           "datetime":"1647433741"
      }]
    }]
   ```
