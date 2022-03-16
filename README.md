# slack-app-clone-api
Slack App Clone API

## Following are the APIs provided
- GET /organization
   ```js
    {
      "organization_name": "Full Stack",
      "organization_id": "1ae5241e-a51b-11ec-b909-0242ac120002"
    }
   ```
- POST /channel
  ```js
    {
      "channel_name": "#slack",
      "organization_id": "1ae5241e-a51b-11ec-b909-0242ac120002",
      "description": "Slack channels",
      "is_private": true/false,
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
    }]
   ```
