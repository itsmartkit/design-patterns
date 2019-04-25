package com.itsmartkit.decorator;

/**
 * 具体装饰者（ConcreteDecorator）角色
 */
public class JsonLogger extends Decorator {
    public JsonLogger(Logger logger){
        super(logger);
    }
    @Override
    public void log(String msg) {
        logger.log(strToJson(msg));
    }

    @Override
    public void info(String msg) {
        logger.info(strToJson(msg));
    }

    @Override
    public void debug(String msg) {
        logger.debug(strToJson(msg));
    }

    @Override
    public void error(String msg) {
        logger.error(strToJson(msg));
    }

    private String strToJson(String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append("\"msg\":\"");
        sb.append(msg);
        sb.append('\"');
        sb.append('}');
        return sb.toString();
    }
}
