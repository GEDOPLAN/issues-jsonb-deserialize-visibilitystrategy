# issues-jsonb-deserialize-visibilitystrategy

Test case for JSON-B desrialization bug in Yasson.

Yasson does not deserialize fields without a public setter, even if the field is marked as JSON property by means of PropertyVisibilityStrategy.

To reproduce have a look at class JsonBindingTest.test_02_testFromJson: The field name remains null. 
This applies to Yasson 1.0.1-SNAPSHOT.

For comparison the maven profile jsonb-johnzon may be activated to use Johnzon instead of Yasson. Johnzon handlres the field as expected.