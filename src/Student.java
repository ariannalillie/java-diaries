// Record Header - everything in parentheses
// For each component in the header Java generates a field with the same name
// and declared type (the field is declared private and final)
// Java also generates a toString method that prints out each attribute in a formatted string
// Records do not allow a way to set values other than passing them by into the record header or by use of constructors
public record Student(String id, String name, String classList) {
}
