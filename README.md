# modelmapper-issue-one

This example respresents issue that I had when I started using ModelMapper library with Java.

I tried to convert OTA xsd files to java classes then to use ModelMapper to convert one version of OTA to other one. I got an error when I tried to mapp nested collections in different classes.

Issue was oppened on offical github page and you can find on following link: https://github.com/modelmapper/modelmapper/issues/212

On Stackoverflow you can find an issue on the following link: http://stackoverflow.com/questions/43115191/java-modelmapper-does-not-compile-data-in-nested-collection-lists

In order to solve this issue add following configuration:
```javascript
modelMapper.getConfiguration().setFieldMatchingEnabled(true);
modelMapper.getConfiguration().setFieldAccessLevel(AccessLevel.PROTECTED);
modelMapper.getConfiguration().setSourceNamingConvention(NamingConventions.JAVABEANS_MUTATOR);
