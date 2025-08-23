## Coding Exercise 39: Toner and Duplex Printing Exercise: Enforcing Encapsulation in a Printer Class

Got it ✅ Here’s your **Printer encapsulation exercise** turned into a **clean, beautiful Markdown document**:

---

# 🖨️ Toner and Duplex Printing Exercise

**Enforcing Encapsulation in a Printer Class**

---

## 📘 Directions

In this exercise, you will create **one class** named **`Printer`**.
This class enforces **encapsulation** by making all fields **private** and controlling access through methods.

---

## 🔹 Class Requirements

### 🔑 Member Variables

* `tonerLevel` → `int`
* `pagesPrinted` → `int`
* `duplex` → `boolean`

All variables must have **private access**.

---

### 🏗️ Constructor

* Accepts two parameters:

    * `tonerLevel` (`int`)
    * `duplex` (`boolean`)
* Rules:

    * `tonerLevel` must be **greater than -1** and **≤ 100**. Otherwise, initialize to **-1**.
    * `duplex` is initialized directly.
    * `pagesPrinted` is always initialized to **0**.

---

### ⚙️ Methods

1. **`addToner(int tonerAmount)`**

    * Valid only if `tonerAmount > 0` and `≤ 100`.
    * If `tonerLevel + tonerAmount > 100`, return **-1**.
    * Otherwise, add `tonerAmount` to `tonerLevel` and return the new value.
    * If initial condition fails, return **-1**.

---

2. **`printPages(int pages)`**

    * Create a variable `pagesToPrint = pages`.
    * If `duplex == true`:

        * Print in **duplex mode**.
        * Calculate pages needed: `pagesToPrint = (pages / 2) + (pages % 2)`.
    * Add `pagesToPrint` to `pagesPrinted`.
    * Return `pagesToPrint`.

---

3. **`getPagesPrinted()`**

    * Returns the total number of pages printed so far (`pagesPrinted`).

---

## ▶️ Example Usage

```java
Printer printer = new Printer(50, true);

System.out.println(printer.addToner(50));
System.out.println("initial page count = " + printer.getPagesPrinted());

int pagesPrinted = printer.printPages(4);
System.out.println("Pages printed was " + pagesPrinted +
                   " new total print count for printer = " + printer.getPagesPrinted());

pagesPrinted = printer.printPages(2);
System.out.println("Pages printed was " + pagesPrinted +
                   " new total print count for printer = " + printer.getPagesPrinted());
```

---

## 📤 Example Output

```
100
initial page count = 0
Printing in duplex mode
Pages printed was 2 new total print count for printer = 2
Printing in duplex mode
Pages printed was 1 new total print count for printer = 3
```

---

## 💡 Tips

* Only **paste the `Printer` class** in the evaluator.
* The `Main` class is only for **testing**.
* You may include a message in `printPages()` such as:

    * `"Printing in duplex mode"` when duplex is `true`.
* For duplex calculation, remember:

    * `/` (division) → quotient only
    * `%` (modulo) → remainder only

---

✨ Done! Now your Printer exercise is structured and easy to follow.

Would you like me to also create a **side-by-side UML diagram** in Markdown (ASCII format) for both exercises (**Bedroom** + **Printer**) so you can quickly visualize the class structure?
