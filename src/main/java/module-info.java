module com.cukraszda {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires java.sql;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires gson;
    requires org.apache.httpcomponents.httpcore;
    requires httpclient;
    requires weka.stable;
    requires org.jfree.jfreechart;
    requires java.desktop;
    opens com.cukraszda to javafx.fxml;
    opens com.oanda.v20.account;
    opens com.oanda.v20.pricing;
    opens com.oanda.v20.pricing_common;
    opens com.oanda.v20.order;
    opens com.oanda.v20.instrument;
    opens com.oanda.v20.transaction;
    opens com.oanda.v20.trade;
    exports com.cukraszda;
    exports com.oanda.v20.primitives;
    exports com.oanda.v20.transaction;
    exports com.oanda.v20.pricing_common;
    exports com.oanda.v20.order;
    exports com.oanda.v20.trade;

}