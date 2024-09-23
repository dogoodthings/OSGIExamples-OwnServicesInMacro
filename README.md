# OSGIExamples-OwnServicesInMacro

Since: S4 1.2.1.0

enhance ECTR Macros with own GenericService implementations

Example ECTR macro code:

```javascript
service = GET_SERVICE('com.dscsag.plm.spi.interfaces.services.GenericService', 'dogoodthings.GenericExampleService')
configuration = service.configurationBuilder()
.p1('A')
.p2('B')
.p3('C')
.p4('D')
.build()

result = service.execute(configuration)
resultObject = result.get()

REPORT(resultObject.getResult())
```

