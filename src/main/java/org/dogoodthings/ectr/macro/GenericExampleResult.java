package org.dogoodthings.ectr.macro;

public class GenericExampleResult
{
  private String r1;
  private String r2;
  private String r3;
  private String r4;

  public GenericExampleResult(String r1, String r2, String r3, String r4)
  {
    this.r1 = r1;
    this.r2 = r2;
    this.r3 = r3;
    this.r4 = r4;
  }

  public String getResult()
  {
    return r1 + r2 + r3 + r4;
  }
}
