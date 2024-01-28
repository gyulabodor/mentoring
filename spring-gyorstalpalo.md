Servlet API

- Minden `Servlethez` tartozik egy `ContextPath`

Itt találhatod meg a hivatalos Java API speceket

- https://jakarta.ee/specifications/

JCP.org - Java Community Process

- https://jcp.org/en/home/index

JSR - Java Specification Request

## Java - ClassPath

- Amikor futtatsz egy Java programot ha a futtatott appod importál másik osztályokat

## Miért találták ki JavaEE-t?

- A cél egy olyan java alapú technologia kidolgozása volt, ami már fel van vértezve a vállalati szoftverek igényeire. - Előre kidolgozott, megírt modulokat jelent beépítve a platformba (EJB ,WebApplication, ServletApi, Security, Adapterek, ApplicationClient, Java Mail, Java Message, JSP stb.) amik nagyon jól fogják segíteni a munkát, így könyebbé válik a vállalati szoftverek fejlesztési élménye.

## Miért találták ki a Springet?

#### Mi volt a fő probléma a J2EE-vel?

- Az Application Serverek igaz nagyon sok dolgot manageltek le és sok mindent tudtak (Pl.: 'Routing' -contextPath, Load Balancing), pont ezért lett nehezen fenttartható és konfigolható az idő előrehaladtával. Nem hozta a várakozásokat.

- Ha azt akartad hogy az osztályaidat felismerje a JavaEE, akkor mindig valamilyen interface implementálásval érted el ezt. Ezek sokszor bonyolult és nagy interfaceket jelent, és sokszor teli voltak olyan funkciókkal amikre neked nem volt szükséged, de muszáj voltál behúzni a kódodba.

### Válasz: Azért találták ki hogy megpróbáljanak egy a Java Enterprise környezettül teljesen független Java Standard Edition alapú keretrendszert fejleszteni ami TÉNYLEGESEN megkönnyíti a fejlesztést.

## Hol a különbség?

A Spring megengedi nekünk hogy a kódunk POJO-kból (Plain Old Java Object) álhasson össze, ami .

- <ins>**POJO**</ins> - egy közönséges Java Class, ami független mindentől és újrafelhasználható, feltételei:

  - Nem függ semmilyen Java Frameworktől
  - Publikus láthatóságú a Class
  - Nem implementál interfacet
  - Nem örököl semmilyen osztálytól
  - Nem tartalmaz Annotációkat
  - Publikus Gettert/Settert tartalmaz az adattagok eléréshez
  - Adattagjai lehetnek **Public | Private | Protected** láthatóságúak
  - _???Van default 'üres' konstruktorra???_

- <ins>**Java Bean**</ins> - szintén egyszerű Java Class, más feltételekkel:

  - Publikus Gettereken/Settereken keresztül éri el az adattagjait
  - Privát adattagjai vannak
  - Implementálnia kell a `Serializable` interface-t
  - Van default 'üres' konstruktorral.

- <ins>**Spring Bean: tulajdonságok**</ins>
  - Java Bean feltételek teljesülnek itt is
  - Scope: Singleton | Prototype | Request | Session | Application | WebSocket
  - Lifecycle events: @PostConstruct & @PreDestroy() - PROXYk & AOP - Aspect Oriented Prog

### Spring IoC container

- Bean Metadata / BeanDefition / Configuration metadata - A Beanek metaadat információit
  3 féle képpen adhatjuk meg a IoC konténernek az új Beanjeinkről metadatot. 1. XML config fájlban írjuk meg a Beaneket 2. Annotációkat használva 3. JavaConfig-ot használva - XYConfig.java classokat létrehozva és implementálva bele a megfelelő Configurer interfacet.

EZEK LINKEK A SPRING KERETRENDSZER DOKUMENTÁCIÓJA:

- docs: https://docs.spring.io/spring-framework/reference/core/beans/introduction.html
- BeanFactory interface: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html
- Container overview: https://docs.spring.io/spring-framework/reference/core/beans/basics.html

EZ A SPRING-BOOT HIVATALOS DOKUMENTÁCIÓJA:
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/

EGYÉB DOKSIK:   
- Spring Data JPA (ORM) docs: https://spring.io/projects/spring-data-jpa
- Hibernate docs: https://hibernate.org/orm/documentation/6.4/
- maven-repository: https://mvnrepository.com/
- design patterns: 
    - https://sourcemaking.com/  
    - https://refactoring.guru