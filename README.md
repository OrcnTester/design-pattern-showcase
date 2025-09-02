# Design Patterns Showcase (Java)

Five fundamental patterns with tiny, runnable demos (Java 11, no extra dependencies):

- Singleton
- Factory
- Strategy
- Observer
- Builder

## 🚀 How to Run
Compile & run any `*Demo.java` with your IDE, or via Maven:

```bash
mvn -q -DskipTests package
java -cp target/design-patterns-showcase-0.1.0.jar com.esdoor.patterns.singleton.SingletonDemo
```

---

## Singleton
**Intent:** Ensure a class has only one instance and provide global access.

```
+---------------------+
|  AppConfig (final)  |
| - instance          |
| + getInstance()     |
+---------------------+
```

👉 [SingletonDemo.java](src/main/java/com/esdoor/patterns/singleton/SingletonDemo.java)

---

## Factory
**Intent:** Create objects without exposing creation logic.

```
RendererFactory -> Renderer (interface)
                   /       \
                Pdf      Html
```

👉 [FactoryDemo.java](src/main/java/com/esdoor/patterns/factory/FactoryDemo.java)

---

## Strategy
**Intent:** Define a family of algorithms, encapsulate each one, and make them interchangeable.

```
PriceCalculator -> TaxStrategy (interface)
                   /         \
              TrTax       NoTax
```

👉 [StrategyDemo.java](src/main/java/com/esdoor/patterns/strategy/StrategyDemo.java)

---

## Observer
**Intent:** One-to-many dependency — when subject changes, all observers are notified.

```
Subject --> Observer
   |          ^
   +----------|
```

👉 [ObserverDemo.java](src/main/java/com/esdoor/patterns/observer/ObserverDemo.java)

---

## Builder
**Intent:** Separate the construction of a complex object from its representation.

```
PdfDoc.Builder -> PdfDoc
```

👉 [BuilderDemo.java](src/main/java/com/esdoor/patterns/builder/BuilderDemo.java)
