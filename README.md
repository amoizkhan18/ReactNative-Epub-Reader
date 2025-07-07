# 📚 ReactNative-Epub-Reader

A customizable and feature-rich EPUB reader plugin built for React Native applications. This library delivers a seamless, accessible, and highly customizable digital reading experience.

---

## ✨ Features

- 📖 Seamless EPUB rendering
- 🌗 Light and dark theme support
- 🔠 Adjustable font size and font family
- 🖍️ Text highlighting support
- ↔️ Horizontal page scrolling
- 🎨 Customizable UI and event hooks

---

## 🚀 Installation

```bash
npm install react-native-epub-reader


🛠️ Usage

import EpubReader from 'react-native-epub-reader';

export default function ReaderScreen() {
  return (
    <EpubReader
      source={{ uri: 'https://example.com/sample.epub' }}
      theme="light"
      fontSize={18}
      fontFamily="Georgia"
      onHighlight={(highlightedText) => console.log('Text highlighted:', highlightedText)}
    />
  );
}


📌 Props

| Prop           | Type       | Default     | Description                                       |
| -------------- | ---------- | ----------- | ------------------------------------------------- |
| `source`       | `object`   | required    | EPUB file source: `{ uri: '...' }` or local asset |
| `theme`        | `string`   | `'light'`   | Reader theme: `'light'` or `'dark'`               |
| `fontSize`     | `number`   | `16`        | Font size for EPUB content                        |
| `fontFamily`   | `string`   | `'System'`  | Font family (e.g., Georgia, Times, etc.)          |
| `onHighlight`  | `function` | `undefined` | Callback triggered when text is highlighted       |
| `onPageChange` | `function` | `undefined` | Called when the user navigates to a new page      |


🎨 Customization

You can modify the EPUB reader UI by wrapping or extending this component. For example:

Add a top navigation bar

Add a “Go to Chapter” dropdown

Integrate bookmarks, annotations, or notes

Track reading progress and sync with a backend

Add accessibility or gesture support



🔧 Development

Clone the repo: git clone git@github.com:your-username/ReactNative-Epub-Reader.git

Install dependencies: cd ReactNative-Epub-Reader
                      npm install

Run in your React Native app: npm start



🤝 Contributing

Contributions, bug reports, and feature suggestions are welcome! Please open an issue or a pull request to help improve this plugin.


📄 License
MIT License © 2025 amoizkhan18


