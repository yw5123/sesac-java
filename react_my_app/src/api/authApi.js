import api from "./axios";

const ENDPOINT = "/auth";
const authApi = {
  // 회원가입
  signup: async (formData) => {
    const response = await api.post(`${ENDPOINT}/signup`, formData);
    return response;
  },

  // 로그인
  login: async (formData) => {
    const response = await api.post(`${ENDPOINT}/login`, formData);
    return response;
  },

  // jwt 검사
  verify: async () => {
    const response = await api.get(`${ENDPOINT}/verify`);
    return response;
  },
};

export default authApi;
