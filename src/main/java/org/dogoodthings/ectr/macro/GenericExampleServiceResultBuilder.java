package org.dogoodthings.ectr.macro;

import com.dscsag.plm.spi.interfaces.services.ServiceResultBuilder;

public class GenericExampleServiceResultBuilder extends ServiceResultBuilder<GenericExampleResult>
{
  private String r1 = "";
  private String r2 = "";
  private String r3 = "";
  private String r4 = "";

  public GenericExampleServiceResultBuilder r1(String r1)
  {
    this.r1 = r1;
    resultObject(new GenericExampleResult(r1, r2, r3, r4));
    return this;
  }

  public GenericExampleServiceResultBuilder r2(String r2)
  {
    this.r2 = r2;
    resultObject(new GenericExampleResult(r1, r2, r3, r4));
    return this;
  }

  public GenericExampleServiceResultBuilder r3(String r3)
  {
    this.r3 = r3;
    resultObject(new GenericExampleResult(r1, r2, r3, r4));
    return this;
  }

  public GenericExampleServiceResultBuilder r4(String r4)
  {
    this.r4 = r4;
    resultObject(new GenericExampleResult(r1, r2, r3, r4));
    return this;
  }
}
