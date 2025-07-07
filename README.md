
# React Native EPUB Reader

React Native library to render EPUB books with highlighting, font controls, and night mode.

## Installation

```bash
npm install react-native-epub-reader
```

## Usage

```jsx
import EPubReader from 'react-native-epub-reader';

<EPubReader
    source={{ uri: 'file:///path/to/book.epub' }}
    onHighlight={highlight => console.log(highlight)}
    fontSize={18}
    fontFamily={'serif'}
    nightMode={false}
/>
```

