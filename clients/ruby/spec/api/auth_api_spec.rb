require 'spec_helper'
require 'json'

describe 'AuthApi' do
  before do
    @api_instance = FeverClient::AuthApi.new
  end

  after do
  end

  describe 'test an instance of AuthApi' do
    it 'should create an instance of AuthApi' do
      expect(@api_instance).to be_instance_of(FeverClient::AuthApi)
    end
  end

  describe 'whoami test' do
    it 'should work' do
    end
  end

end
