# modelmapper-issue-one

This example respresents an issue that I had when I started using ModelMapper library with Java.

I tried to convert OTA xsd files to java classes then to use ModelMapper to convert one version of OTA to another one. I got an error when I tried to map nested collections in different classes.

Github issue: https://github.com/modelmapper/modelmapper/issues/212
Stackoverflow issue: http://stackoverflow.com/questions/43115191/java-modelmapper-does-not-compile-data-in-nested-collection-lists

In order to solve this problem you just have to add following configuration:
```javascript
modelMapper.getConfiguration().setFieldMatchingEnabled(true);
modelMapper.getConfiguration().setFieldAccessLevel(AccessLevel.PROTECTED);
modelMapper.getConfiguration().setSourceNamingConvention(NamingConventions.JAVABEANS_MUTATOR);
