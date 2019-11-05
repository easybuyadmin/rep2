import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static void main(String[] args) {
        List<String>   wrings=new ArrayList<String>();
        boolean  overwring=true;
        File   confifile=new File("D:\\20190225\\code02\\easybuy-parent\\generatorConfig.xml");
        ConfigurationParser    cp=new ConfigurationParser(wrings);
        try {
            Configuration  config=cp.parseConfiguration(confifile);
            DefaultShellCallback   callback=new DefaultShellCallback(overwring);
            MyBatisGenerator      myBatisGenerator=new MyBatisGenerator(config,callback,wrings);
             myBatisGenerator.generate(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
