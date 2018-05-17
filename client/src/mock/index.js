import axios from 'axios'
import MockAdapter from 'axios-mock-adapter'

let mockAdapter = new MockAdapter(axios)

import {
    adapters as quotation
} from '@/mock/quotation.js'
quotation.forEach(item => item(mockAdapter))

export default mockAdapter