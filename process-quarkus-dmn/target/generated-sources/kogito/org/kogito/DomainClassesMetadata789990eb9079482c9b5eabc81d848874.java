package org.kogito;
public class DomainClassesMetadata789990eb9079482c9b5eabc81d848874 {

    public static final org.drools.model.DomainClassMetadata java_util_Date_Metadata_INSTANCE = new java_util_Date_Metadata();
    private static class java_util_Date_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return java.util.Date.class;
        }

        @Override
        public int getPropertiesSize() {
            return 14;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "date": return 1;
                case "day": return 2;
                case "hours": return 3;
                case "minutes": return 4;
                case "month": return 5;
                case "seconds": return 6;
                case "time": return 7;
                case "timezoneOffset": return 8;
                case "year": return 9;
                case "clone": return 10;
                case "toGMTString": return 11;
                case "toInstant": return 12;
                case "toLocaleString": return 13;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class java.util.Date");
        }
    }
    public static final org.drools.model.DomainClassMetadata org_kogito_Item_Metadata_INSTANCE = new org_kogito_Item_Metadata();
    private static class org_kogito_Item_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kogito.Item.class;
        }

        @Override
        public int getPropertiesSize() {
            return 6;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "category": return 1;
                case "itemName": return 2;
                case "itemPrice": return 3;
                case "requestExpiration": return 4;
                case "validPrice": return 5;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kogito.Item");
        }
    }
    public static final org.drools.model.DomainClassMetadata org_drools_ruleunits_api_SingletonStore_Metadata_INSTANCE = new org_drools_ruleunits_api_SingletonStore_Metadata();
    private static class org_drools_ruleunits_api_SingletonStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.drools.ruleunits.api.SingletonStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 1;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.drools.ruleunits.api.SingletonStore");
        }
    }
}