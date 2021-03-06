/*
 * Copyright 2011-17 Fraunhofer ISE, energy & meteo Systems GmbH and other contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.openmuc.openiec61850.clientgui.databind;

import javax.swing.JComboBox;
import javax.swing.JComponent;

import org.openmuc.openiec61850.BdaDoubleBitPos;
import org.openmuc.openiec61850.BdaType;
import org.openmuc.openiec61850.clientgui.BasicDataBind;

public class DoubleBitPosDataBind extends BasicDataBind<BdaDoubleBitPos> {

    @SuppressWarnings("unchecked")
    private final JComboBox valueField = new JComboBox(BdaDoubleBitPos.DoubleBitPos.values());

    public DoubleBitPosDataBind(BdaDoubleBitPos data) {
        super(data, BdaType.DOUBLE_BIT_POS);
    }

    @Override
    protected JComponent init() {
        return valueField;
    }

    @Override
    protected void resetImpl() {
        valueField.setSelectedItem(data.getDoubleBitPos());
    }

    @Override
    protected void writeImpl() {
        // TODO uncomment once data.setTapCommand() is implemented
        // data.setTapCommand(valueField.getSelectedItem());
    }
}
