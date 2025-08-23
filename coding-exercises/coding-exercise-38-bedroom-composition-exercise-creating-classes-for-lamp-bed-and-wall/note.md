Here’s your exercise rewritten into a clean, well-styled **Markdown document**:

---

# 🛏️ Bedroom Composition Exercise

**Creating Classes for Lamp, Bed, Ceiling, Wall, and Bedroom**

---

## 📘 Directions

This is an **exercise in Class Composition**.
You must create **five classes** with associated **member variables** and **methods**.

---

## 🔹 Class Requirements

### 1. **Lamp**

* **Private member variables**:

    * `style` → `String`
    * `battery` → `boolean`
    * `globRating` → `int`
* **Constructor**: accepts all three variables.
* **Methods**:

    * `turnOn()` → prints *"Lamp -> Turning on"*.
    * `getStyle()` → returns `style`.
    * `isBattery()` → returns `battery`.
    * `getGlobRating()` → returns `globRating`.

---

### 2. **Bed**

* **Private member variables**:

    * `style` → `String`
    * `pillows`, `height`, `sheets`, `quilt` → `int`
* **Constructor**: accepts all five variables.
* **Methods**:

    * `make()` → prints *"Bed -> Making | ".*
    * `getStyle()` → returns `style`.
    * `getPillows()` → returns `pillows`.
    * `getHeight()` → returns `height`.
    * `getSheets()` → returns `sheets`.
    * `getQuilt()` → returns `quilt`.

---

### 3. **Ceiling**

* **Private member variables**:

    * `height` → `int`
    * `paintedColor` → `int`
* **Constructor**: accepts both variables.
* **Methods**:

    * `getHeight()` → returns `height`.
    * `getPaintedColor()` → returns `paintedColor`.

---

### 4. **Wall**

* **Private member variable**:

    * `direction` → `String`
* **Constructor**: accepts `direction`.
* **Method**:

    * `getDirection()` → returns `direction`.

---

### 5. **Bedroom**

* **Private member variables**:

    * `name` → `String`
    * `wall1`, `wall2`, `wall3`, `wall4` → `Wall`
    * `ceiling` → `Ceiling`
    * `bed` → `Bed`
    * `lamp` → `Lamp`
* **Constructor**: accepts all variables.
* **Methods**:

    * `makeBed()` → prints *"Bedroom -> Making bed | "* and calls `bed.make()`.
    * `getLamp()` → returns the `Lamp` object.

---

## ▶️ Testing Your Code

Use the following code inside your `main` class:

```java
Wall wall1 = new Wall("West");
Wall wall2 = new Wall("East");
Wall wall3 = new Wall("South");
Wall wall4 = new Wall("North");

Ceiling ceiling = new Ceiling(12, 55);

Bed bed = new Bed("Modern", 4, 3, 2, 1);

Lamp lamp = new Lamp("Classic", false, 75);

Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

bedRoom.makeBed();
bedRoom.getLamp().turnOn();
```

---

## 💡 Tips

* Do **not** include the `main()` method in the code evaluator.
* Only submit the **five classes**.
* Ensure output **exactly matches** the following:

1. `Bedroom -> Making bed | `
2. `Bed -> Making | `
3. `Lamp -> Turning on`

---

✨ That’s the full breakdown!

Do you want me to also create a **nicely formatted UML diagram in Markdown (ASCII style)** for these classes so you can visualize their relationships?
