package io.lnk.protocol.xml.xstream;

import org.apache.commons.lang3.StringUtils;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class IntegerFilterConverter implements Converter {

    @Override
    public boolean canConvert(@SuppressWarnings("rawtypes") Class arg0) {
        return Integer.class == arg0;
    }

    @Override
    public void marshal(Object arg0, HierarchicalStreamWriter arg1, MarshallingContext arg2) {

    }

    @Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext arg1) {
        if (StringUtils.isBlank(reader.getValue())) {
            return null;
        }
        return Integer.parseInt(reader.getValue());
    }

}
