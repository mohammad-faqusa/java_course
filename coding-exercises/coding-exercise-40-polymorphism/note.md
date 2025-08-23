## Coding Exercise 40: Polymorphism

Perfect 👍 Here’s the **Polymorphism exercise** rewritten into a **structured, styled Markdown guide**:

---

# 🚗 Polymorphism Exercise

**Creating a Base Class and Subclasses of Vehicles**

---

## 📘 Description

In this exercise, you will create **four vehicle classes** to practice **polymorphism**:

* **`Car`** → Base class
* **`Mitsubishi`**, **`Holden`**, and **`Ford`** → Subclasses that override behavior

---

## 🔹 Class Requirements

### 1. **Car** (Base Class)

* **Private member variables**:

    * `engine` → `boolean`
    * `cylinders` → `int`
    * `name` → `String`
    * `wheels` → `int`

* **Constructor**:

    * Accepts two parameters: `cylinders` and `name`.
    * Sets `engine = true` and `wheels = 4` by default.

* **Methods**:

    * `startEngine()` → returns `"Car -> startEngine()"`.
    * `accelerate()` → returns `"Car -> accelerate()"`.
    * `brake()` → returns `"Car -> brake()"`.
    * `getCylinders()` → getter for `cylinders`.
    * `getName()` → getter for `name`.

---

### 2. **Mitsubishi** (Subclass of Car)

* **Constructor**: calls `super(cylinders, name)`.
* **Overrides**:

    * `startEngine()` → returns `"Mitsubishi -> startEngine()"`.
    * `accelerate()` → returns `"Mitsubishi -> accelerate()"`.
    * `brake()` → returns `"Mitsubishi -> brake()"`.

---

### 3. **Ford** (Subclass of Car)

* **Constructor**: calls `super(cylinders, name)`.
* **Overrides**:

    * `startEngine()` → returns `"Ford -> startEngine()"`.
    * `accelerate()` → returns `"Ford -> accelerate()"`.
    * `brake()` → returns `"Ford -> brake()"`.

---

### 4. **Holden** (Subclass of Car)

* **Constructor**: calls `super(cylinders, name)`.
* **Overrides**:

    * `startEngine()` → returns `"Holden -> startEngine()"`.
    * `accelerate()` → returns `"Holden -> accelerate()"`.
    * `brake()` → returns `"Holden -> brake()"`.

---

## ▶️ Example Usage

```java
Car car = new Car(8, "Base car");
System.out.println(car.startEngine());
System.out.println(car.accelerate());
System.out.println(car.brake());

Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
System.out.println(mitsubishi.startEngine());
System.out.println(mitsubishi.accelerate());
System.out.println(mitsubishi.brake());

Ford ford = new Ford(6, "Ford Falcon");
System.out.println(ford.startEngine());
System.out.println(ford.accelerate());
System.out.println(ford.brake());

Holden holden = new Holden(6, "Holden Commodore");
System.out.println(holden.startEngine());
System.out.println(holden.accelerate());
System.out.println(holden.brake());
```

---

## 📤 Example Output

```
Car -> startEngine()
Car -> accelerate()
Car -> brake()
Mitsubishi -> startEngine()
Mitsubishi -> accelerate()
Mitsubishi -> brake()
Ford -> startEngine()
Ford -> accelerate()
Ford -> brake()
Holden -> startEngine()
Holden -> accelerate()
Holden -> brake()
```

---

## 💡 Notes

* Your **`Main` class is only for testing** and should **not** be submitted.
* In the evaluator, paste each class into its own class file (`Car.java`, `Mitsubishi.java`, etc.).
* This exercise demonstrates **runtime polymorphism** by overriding parent methods in subclasses.

---

✨ Done! Now all three exercises (Bedroom, Printer, and Polymorphism) have consistent, styled Markdown documentation.

Would you like me to **combine all three into a single Markdown “OOP Exercises Handbook”** so you can keep them in one clean reference document?
