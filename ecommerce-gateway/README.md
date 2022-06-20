调用注册接口为:
127.0.0.1:9001/gateway/ecommerce-authority-center/authority/register
参数为：
```aidl
{
	"username":"blf",
	"password":"1234567"
}
```
nacos配置文件中的参数为:
```aidl
[{
	"id": "e-commerce-authority-center",
	"order": 1,
	"uri": "lb://e-commerce-authority-center",
	"predicates": [{
		"name": "Path",
		"args": {
			"parttern": "/gateway/ecommerce-authority-center/**"
		}
	}]
}]
```