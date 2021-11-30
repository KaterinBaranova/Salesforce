
package enums;

public enum AccountType {
    ANALYST("Analyst"),
    CUSTOMER("Customer"),
    INVESTOR("Investor"),
    PARTNER("Partner");

    private final String text;

    AccountType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public static AccountType fromString(String text) {
        for (AccountType customer : AccountType.values()) {
            if (customer.text.equalsIgnoreCase(text)) {
                return customer;
            }
        }
        return null;
    }
}
