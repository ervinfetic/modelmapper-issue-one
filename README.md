# modelmapper-issue-one

Github issue: https://github.com/modelmapper/modelmapper/issues/212

Stackoverflow issue: http://stackoverflow.com/questions/43115191/java-modelmapper-does-not-compile-data-in-nested-collection-lists

In order to solve this problem you just have to add the following configuration:
```javascript
modelMapper.getConfiguration().setFieldMatchingEnabled(true);
modelMapper.getConfiguration().setFieldAccessLevel(AccessLevel.PROTECTED);
modelMapper.getConfiguration().setSourceNamingConvention(NamingConventions.JAVABEANS_MUTATOR);
