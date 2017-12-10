package io.nuls.event.bus.event;

import io.nuls.core.chain.entity.NulsDigestData;
import io.nuls.core.constant.NulsConstant;
import io.nuls.core.event.BaseNulsEvent;
import io.nuls.core.utils.io.NulsByteBuffer;
import io.nuls.event.bus.constant.EventConstant;

/**
 * @author Niels
 * @date 2017/12/8
 */
public class GetBodyEvent extends BaseNulsEvent<NulsDigestData> {

    public GetBodyEvent() {
        super(NulsConstant.MODULE_ID_EVENT_BUS, EventConstant.EVENT_TYPE_GET_EVENT_BODY_EVENT);
    }

    @Override
    protected NulsDigestData parseEventBody(NulsByteBuffer byteBuffer) {
        NulsDigestData data = new NulsDigestData();
        data.parse(byteBuffer);
        return data;
    }
}