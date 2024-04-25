package org.dogoodthings.ectr.macro;

import com.dscsag.plm.spi.interfaces.ECTRService;
import com.dscsag.plm.spi.interfaces.services.GenericService;
import com.dscsag.plm.spi.interfaces.services.ServiceResult;

public class GenericExampleService implements GenericService<GenericExampleResult, GenericExampleParameterBuilder, GenericExampleParameter>
{
  private final ECTRService ectrService;

  public GenericExampleService(ECTRService inputService)
  {
    ectrService = inputService;
  }

  @Override
  public ServiceResult<GenericExampleResult> execute(GenericExampleParameter genericExampleParameter)
  {
    String p1 = genericExampleParameter.getP1();
    String p2 = genericExampleParameter.getP2();
    String p3 = genericExampleParameter.getP3();
    String p4 = genericExampleParameter.getP4();

    ectrService.getPlmLogger().debug("This is a service call.");
    ectrService.getPlmLogger().debug("P1 = '" + p1 + "'");
    ectrService.getPlmLogger().debug("P2 = '" + p2 + "'");
    ectrService.getPlmLogger().debug("P3 = '" + p3 + "'");
    ectrService.getPlmLogger().debug("P4 = '" + p4 + "'");
    return new GenericExampleServiceResultBuilder()
        .r1(p1)
        .r2(p2)
        .r3(p3)
        .r4(p4)
        .build();
  }

  @Override
  public GenericExampleParameterBuilder configurationBuilder()
  {
    return new GenericExampleParameterBuilder();
  }
}
