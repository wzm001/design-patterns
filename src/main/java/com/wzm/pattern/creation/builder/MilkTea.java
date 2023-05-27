package com.wzm.pattern.creation.builder;

/**
 * 奶茶
 *
 * @author wuzhiming@itiger.com
 */
public class MilkTea {

    private final String type; // 原味/水果味。。。
    private final String size; // 大杯/中杯/小杯
    private final boolean ice; // 加冰

    // 私有化构造方法，只能通过 builder 创建
    private MilkTea(Builder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.ice = builder.ice;
    }

    @Override
    public String toString() {
        return type + size + (ice ? "加冰" : "不加冰");
    }

    /**
     * MilkTea 的构建器
     */
    public static class Builder {
        private final String type; // 必选的配置
        private String size = "中杯"; // 默认的配置
        private boolean ice = false; // 默认的配置

        public Builder(String type) {
            this.type = type;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder ice(boolean ice) {
            this.ice = ice;
            return this;
        }

        public MilkTea build() {
            return new MilkTea(this);
        }
    }
}
