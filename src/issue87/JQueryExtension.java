package issue87;

import org.concordion.api.Resource;
import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;

public class JQueryExtension implements ConcordionExtension {
    @Override
    public void addTo(ConcordionExtender concordionExtender) {
        concordionExtender.withLinkedJavaScript("/issue87/script/jquery-2.1.1.min.js",
            new Resource("/issue87/script/jquery-2.1.1.min.js"));
    }
}