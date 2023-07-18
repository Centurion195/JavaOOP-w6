package work2;

public class AccountReportGenerator implements ReportGeneratorXml, ReportGeneratorJson {
    String report = null;

    @Override
    public String generateXml() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String generateJson() {
        // todo Logic
        return report;
    }
}
