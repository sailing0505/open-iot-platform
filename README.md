# open-iot-platform
open iot
open iot 开源IOT平台
DB:
open_iot_oauth_center:可以由OAUTH2、services、gatway路由等数据结构组成
open_iot_log_center:记录日志、链路等相关的数据结构
open_iot_platform_center：用户、任务等

服务：
eureka-server：注册中心
gateway：网关中心
oauth：鉴权中心；可以包括认证授权服务端、客户端、SSO服务端等
    --eureka-server:认证授权服务
open-platform：平台相关服务
    --device-center:设备接入服务，基础MQTT/MONGODB等
	--net-platform:网络平台服务
open-framework：各种组件
   --api-commons：
   --db-core：
   --modelandutils-core
   --swagger-core
