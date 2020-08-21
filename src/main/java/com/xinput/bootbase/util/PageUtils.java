package com.xinput.bootbase.util;

import com.xinput.bootbase.config.DefaultConfig;

public class PageUtils {

    private static final int MAX_OFFSET = DefaultConfig.getMaxOffset();

    private static final int MAX_LIMIT = DefaultConfig.getMaxLimit();

    private static final int DEFAULT_LIMIT = DefaultConfig.getDefaultLimit();

    /**
     * 验证limit参数，参数可以为null
     *
     * @param limit
     * @return
     */
    public static Integer validateLimit(Integer limit) {
        if (limit == null) {
            return null;
        }

        if (limit <= 0) {
            limit = DEFAULT_LIMIT;
        }

        return limit > MAX_LIMIT ? MAX_LIMIT : limit;
    }

    /**
     * 验证offset参数,参数可以为null
     *
     * @param offset
     * @return
     */
    public static Integer validateOffset(Integer offset) {
        if (offset == null) {
            return null;
        }
        if (offset < 0) {
            offset = 0;
        }
        return offset > MAX_OFFSET ? MAX_OFFSET : offset;
    }

    /**
     * 验证limit参数，参数不能为空
     *
     * @param limit
     * @return
     */
    public static int safeLimit(Integer limit) {
        if (limit == null || limit <= 0) {
            limit = DEFAULT_LIMIT;
        }
        return limit > MAX_LIMIT ? MAX_LIMIT : limit;
    }

    /**
     * 验证offset参数，参数不能为空
     *
     * @param offset
     * @return
     */
    public static int safeOffset(Integer offset) {
        if (offset == null || offset < 0) {
            offset = 0;
        }
        return offset > MAX_OFFSET ? MAX_OFFSET : offset;
    }
}
