package org.dogoodthings.ectr.macro;

public class GenericExampleParameterBuilder
{
  private String p1 = "";
  private String p2 = "";
  private String p3 = "";
  private String p4 = "";

  public GenericExampleParameterBuilder p1(String p1)
  {
    this.p1 = p1;
    return this;
  }
  public GenericExampleParameterBuilder p2(String p2)
  {
    this.p2 = p2;
    return this;
  }
  public GenericExampleParameterBuilder p3(String p3)
  {
    this.p3 = p3;
    return this;
  }
  public GenericExampleParameterBuilder p4(String p4)
  {
    this.p4 = p4;
    return this;
  }

  public GenericExampleParameter build()
  {
    return new GenericExampleParameter(p1, p2, p3, p4);
  }
}
