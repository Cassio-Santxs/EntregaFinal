<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
    <Property name="resizable" type="boolean" value="false"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="true"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Component id="jPanel1" alignment="0" max="32767" attributes="0"/>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Component id="jPanel1" alignment="0" max="32767" attributes="0"/>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Container class="javax.swing.JPanel" name="jPanel1">
      <Properties>
        <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="ff" green="ff" red="ff" type="rgb"/>
        </Property>
      </Properties>

      <Layout>
        <DimensionLayout dim="0">
          <Group type="103" groupAlignment="0" attributes="0">
              <Component id="Header" max="32767" attributes="0"/>
              <Component id="jScrollPane1" alignment="0" pref="984" max="32767" attributes="0"/>
          </Group>
        </DimensionLayout>
        <DimensionLayout dim="1">
          <Group type="103" groupAlignment="0" attributes="0">
              <Group type="102" alignment="0" attributes="0">
                  <Component id="Header" min="-2" max="-2" attributes="0"/>
                  <EmptySpace pref="109" max="32767" attributes="0"/>
                  <Component id="jScrollPane1" min="-2" pref="318" max="-2" attributes="0"/>
                  <EmptySpace min="-2" pref="32" max="-2" attributes="0"/>
              </Group>
          </Group>
        </DimensionLayout>
      </Layout>
      <SubComponents>
        <Container class="javax.swing.JPanel" name="Header">
          <Properties>
            <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="dd" green="62" red="62" type="rgb"/>
            </Property>
          </Properties>

          <Layout>
            <DimensionLayout dim="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="22" max="-2" attributes="0"/>
                      <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
                      <EmptySpace max="32767" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
            <DimensionLayout dim="1">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="27" max="-2" attributes="0"/>
                      <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
                      <EmptySpace pref="32" max="32767" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
          </Layout>
          <SubComponents>
            <Component class="javax.swing.JLabel" name="jLabel1">
              <Properties>
                <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                  <Font name="Segoe UI Black" size="24" style="1"/>
                </Property>
                <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="ff" red="ff" type="rgb"/>
                </Property>
                <Property name="text" type="java.lang.String" value="Consultas"/>
              </Properties>
            </Component>
          </SubComponents>
        </Container>
        <Container class="javax.swing.JScrollPane" name="jScrollPane1">
          <AuxValues>
            <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
          </AuxValues>

          <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
          <SubComponents>
            <Component class="javax.swing.JTable" name="jTable1">
              <Properties>
                <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
                  <Table columnCount="4" rowCount="4">
                    <Column editable="true" title="Title 1" type="java.lang.Object"/>
                    <Column editable="true" title="Title 2" type="java.lang.Object"/>
                    <Column editable="true" title="Title 3" type="java.lang.Object"/>
                    <Column editable="true" title="Title 4" type="java.lang.Object"/>
                  </Table>
                </Property>
              </Properties>
            </Component>
          </SubComponents>
        </Container>
      </SubComponents>
    </Container>
  </SubComponents>
</Form>
