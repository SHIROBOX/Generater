package com.mycompany.generater.service.impl;

import com.mycompany.generater.service.GeneraterService;
import com.mycompany.generater.util.DateUtil;

/**
 *
 * @author mbk_i
 */
public class GeneraterServiceImpl implements GeneraterService {
    
    @Override
    public String generateIdStudent(int seq) {
        String numberSeq = String.format("%04d", seq);
        String id = DateUtil.getCurrentYear2Digits() + 51 + 0 + numberSeq;
        return id + generateIdCheck(id, seq);
    }
    
    @Override
    public String generateIdCheck(String id, int seq) {
        double valueId = Double.parseDouble(id);
        double idCheck = seq % 2 == 0 ? (valueId % 5) * 2 + 1 : (valueId % 5) * 2;
        return String.format("%.0f", idCheck);
    }
    
}
