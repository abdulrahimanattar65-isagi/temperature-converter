# Temperature Converter

A simple temperature conversion tool built two ways: a Java console program and a browser-based UI. Convert between Fahrenheit and Celsius instantly.

**Live demo:** https://abdulrahimanattar65-isagi.github.io/temperature-converter/

## Features

- Convert Fahrenheit → Celsius and Celsius → Fahrenheit
- Java console version with a menu-driven interface and input validation
- Browser UI with live conversion as you type, a visual gauge, and a swap button to flip direction
- No dependencies — runs with just the JDK (for the Java version) or any modern browser (for the UI)

## Tech Stack

- **Java** — console-based converter logic
- **HTML, CSS, JavaScript** — browser UI (no frameworks, no build step)

## Project Structure

```
temperature-converter/
├── TemperatureConverter.java   # Java console version
├── index.html                  # Browser UI version
└── README.md
```

## Running the Java Console Version

Requires a JDK (not just a JRE) installed.

```bash
javac TemperatureConverter.java
java TemperatureConverter
```

Follow the on-screen menu to choose a conversion direction and enter a value.

## Running the Browser UI Version

No installation needed — just open the file:

```bash
# Double-click index.html, or open it directly in a browser
```

Or view it live at the link above (hosted via GitHub Pages).

## How It Works

Both versions use the standard conversion formulas:

- **Celsius → Fahrenheit:** `F = (C × 9/5) + 32`
- **Fahrenheit → Celsius:** `C = (F − 32) × 5/9`

## Author

**Abdulrahiman Attar**
[LinkedIn](https://linkedin.com/in/abdulrahiman-attar-244927341) · [GitHub](https://github.com/abdulrahimanattar65-isagi)
