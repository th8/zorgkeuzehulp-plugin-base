package nl.ambulancenl.plugins.validator;

import nl.ambulancenl.plugins.validator.objects.HealthcareProviderInfo;

public interface ValidatorPlugin {

    /* Returns 'true' when correctly loaded*/
    boolean load();

    /* Name of the HTML field, so the passed value can be passed to the validate method */
    String getValidatorFieldName();

    /* Returns HTML to inject in the 'create-healtcare-provider page' */
    String getHTMLToInject();

    /* Handles validation for the healthcare provider */
    boolean validateHealthcareProvider(String validatorInput, HealthcareProviderInfo healthcareProviderInfo);
}
